package repository;

import domain.Issue;
import domain.Label;
import domain.Project;
import domain.User;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class IssuesRepositoryTest {

    IssuesRepository repository = new IssuesRepository();
    User nick = new User(1,"Nick");
    Label label1  = new Label(1,"label1");
    Label label2  = new Label(2,"label2");
    Project project1 = new Project(1,"Project1");
    Set<Label> labelsHashSet = Set.of(label1, label2);
    HashSet<Project> projectHashSet = new HashSet<Project>();
    User assigneeHashSet = new User();



    Issue issue1 = new Issue(1,"Nick's Issue",nick, labelsHashSet,projectHashSet,"published",assigneeHashSet,true);

    @Test
    void add() {
       repository.add(issue1);
       Collection<Issue> expected = List.of(issue1);
       Collection<Issue> actual = repository.getAll();
       assertEquals(expected,actual);
    }

    @Test
    void getAll() {
    }

    @Test
    void getById() {
    }

    @Test
    void removeById() {
    }

    @Test
    void remove() {
    }

    @Test
    void addAll() {
    }

    @Test
    void removeAll() {
    }
}