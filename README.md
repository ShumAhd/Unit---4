# Unit-тесты (семинары)
## Урок 4. Зависимости в тестах

### Домашка

Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?

Задание 2.

У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

### Домашняя работа
1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
```
 1. Позволяют тестировать отдельные части системы в изоляции.
 2. Для имитации внешних зависимостей, таких как базы данных или внешние сервисы.
 3. Использование заглушек делает тесты более повторяемыми, поскольку они не зависят от внешнего состояния.
 4. Ускоряют тестирования, поскольку они обычно работают быстрее, чем реальные зависимости.
```

2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

`Mock-объекты`

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

`Stub-объекты`

4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

`Фейковые объекты (fake objects)`

### Прямые ссылки

[pom.xml](https://github.com/ShumAhd/Unit---4/blob/main/pom.xml)

[class Book](https://github.com/ShumAhd/Unit---4/blob/main/src/main/java/ro/shum/Book.java)

[interface BookRepository](https://github.com/ShumAhd/Unit---4/blob/main/src/main/java/ro/shum/BookRepository.java)

[class BookService](https://github.com/ShumAhd/Unit---4/blob/main/src/main/java/ro/shum/BookService.java)

[class BookServiceTest](https://github.com/ShumAhd/Unit---4/blob/main/src/test/java/ro/shum/BookServiceTest.java)