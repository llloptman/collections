package manager;

import domain.Issue;
import domain.Label;
import domain.Project;
import domain.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.IssuesRepository;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IssuesManagerTest {

    IssuesRepository repository = new IssuesRepository();
    IssuesManager manager = new IssuesManager(repository);
    User nick = new User(1,"Nick");
    User nick1 = new User(2, "Nick1");
    User nick2 = new User(3,"Nick2");
    Label label1  = new Label(1,"label1");
    Label label2  = new Label(2,"label2");
    Project project1 = new Project(1,"Super Project");
    Set<Label> labelsHashSet1 = Set.of(label1, label2);
    Set<Label> labelsHashSet2 = Set.of(label1, label2);
    Set<Project> projectHashSet = Set.of(project1);



    //Создаем Issue
    Issue issue1 = new Issue(1,"Nick's Issue",nick1, labelsHashSet1,projectHashSet,"published",nick2,true);
    Issue issue2 = new Issue(2,"Issue",nick2, labelsHashSet1,projectHashSet,"published",nick1,false);
    Issue issue3 = new Issue(3,"Nick Issue",nick, labelsHashSet2,projectHashSet,"published",nick1,true);
    Issue issue4 = new Issue(4,"Nick's Issue",nick, labelsHashSet2,projectHashSet,"published",nick2,true);


    @Test
    void addIssue() {
        manager.addIssue(issue1);
        Collection<Issue> expected = List.of(issue1);
        Collection<Issue> actual = manager.getAll();
        assertEquals(expected,actual);
    }

    @Test
    void toggleIssue() {
        repository.add(issue2);
        manager.toggleIsOpenOfIssue(2);
        boolean actual = issue2.isOpen();
        assertEquals(true,actual);

        manager.toggleIsOpenOfIssue(2);
        actual = issue2.isOpen();
        assertEquals(false,actual);
    }


    @Test
    void shouldFilterByAuthor() {
        List issues = List.of(issue1,issue2,issue3,issue4);
        List ExpectedIssues = List.of(issue1);
        repository.addAll(issues);
        Collection<Issue> actual = manager.filterByAuthor("Nick1");
        Collection<Issue> expected = ExpectedIssues;
        assertEquals(expected,actual);
    }

    @Test
    void shouldFilterByAssignee() {
        List issues = List.of(issue1,issue2,issue3,issue4);
        List ExpectedIssues = List.of(issue2,issue3);
        repository.addAll(issues);
        Collection<Issue> actual = manager.filterByAssignee("Nick1");
        Collection<Issue> expected = ExpectedIssues;
        assertEquals(expected,actual);
    }

//    @Test
//    void sortById() {
//        List issues = List.of(issue4,issue2,issue3,issue1);
//        List ExpectedIssues = List.of(issue1,issue2,issue3,issue4);
//        repository.addAll(issues);
//        Collection<Issue> actual = manager.sortById(issues);
//        Collection<Issue> expected = ExpectedIssues;
//        assertEquals(expected,actual);
//    }
//    @Test
//    void sortByIdReversed() {
//        List issues = List.of(issue1,issue2,issue3,issue4);
//        List ExpectedIssues = List.of(issue4,issue3,issue2,issue1);
//        repository.addAll(issues);
//        Collection<Issue> actual = manager.sortByIdReversed(issues);
//        Collection<Issue> expected = ExpectedIssues;
//        assertEquals(expected,actual);
//    }
}