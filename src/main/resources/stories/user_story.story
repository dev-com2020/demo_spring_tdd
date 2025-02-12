Scenario: Dodawanie użytkownika do systemu

Given system jest gotowy do rejestracji użytkowników
When nowy użytkownik "John" jest dodany
Then lista użytkowników zawiera "John"

