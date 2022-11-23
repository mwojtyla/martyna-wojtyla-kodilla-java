package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
       /* BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);
*/
        Forum theForum = new Forum();
        Map<Integer,ForumUser> theResultMapOfUsers = theForum.getUsersList().stream()
                .filter(sex -> sex.getSex()=='M')
                .filter(age-> age.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(posts -> posts.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));



        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
    }
