package com.example.demo;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class UserStory extends JUnitStories {
    private final ApplicationContext applicationContext;

    @Value("classpath:stories/user_story.story") private org.springframework.core.io.Resource resource;

    public UserStory() {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withDefaultFormats()
                        .withFormats(Format.CONSOLE, Format.TXT));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InjectableStepsFactory() {
            @Override
            public List<CandidateSteps> createCandidateSteps() {
                return List.of();
            }

            @Override
            public Object createInstanceOfType(Class<?> aClass) {
                return null;
            }
        };
    }

    @Override
    protected List<String> storyPaths(){
        try {
            resource.getFile().toPath();
            System.out.println(resource.getFile().toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ClassPathResource resource = new ClassPathResource("stories/user_story.story");
        Path path = null;
        try {
            path = Paths.get(resource.getURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        String content = new String(Files.readAllBytes(path));
//        return List.of(content.split("\\r?\\n"));
        return List.of();

    }

}


