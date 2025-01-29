package com.graphql.qbe.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private BookRepository bookRepository;

    public DataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Book> books = Arrays.asList(
                new Book(null, "Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", "2008"),
                new Book(null, "The Pragmatic Programmer: Your Journey to Mastery", "Andrew Hunt, David Thomas", "1999"),
                new Book(null, "Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1994"),
                new Book(null, "Refactoring: Improving the Design of Existing Code", "Martin Fowler", "1999"),
                new Book(null, "The Mythical Man-Month: Essays on Software Engineering", "Fred Brooks", "1975"),
                new Book(null, "Code Complete: A Practical Handbook of Software Construction", "Steve McConnell", "1993"),
                new Book(null, "You Don't Know JS (Book Series)", "Kyle Simpson", "2014-2019"),
                new Book(null, "The Clean Coder: A Code of Conduct for Professional Programmers", "Robert C. Martin", "2011"),
                new Book(null, "Continuous Delivery: Reliable Software Releases through Build, Test, and Deployment Automation", "Jez Humble, David Farley", "2010"),
                new Book(null, "Working Effectively with Legacy Code", "Michael Feathers", "2004")
        );

        bookRepository.saveAll(books);
    }
}
