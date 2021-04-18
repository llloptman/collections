package manager;

import domain.Issue;
import manager.comparators.IdComporator;
import repository.IssuesRepository;

import java.util.Collection;
import java.util.stream.Stream;

public class IssuesManager {

    private IssuesRepository repository;
    private IdComporator IdComporator = new IdComporator();

    public IssuesManager(IssuesRepository repository) {
        this.repository = repository;
    }

    public Collection<Issue> getAll (){
        return repository.getAll();
    }

    public boolean addIssue(Issue newIssue) {
        return repository.add(newIssue);
    }
//    public void openIssue(int id) {
//        repository.getById(id).setOpen(true);
//    }
//    public void closeIssue(int id) {
//        repository.getById(id).setOpen(false);

//    }

    public void toggleIsOpenOfIssue(int id){
        if (repository.getById(id).isOpen() == true){
            repository.getById(id).setOpen(false);
        }else {
            repository.getById(id).setOpen(true);

        }
    }

    public Collection<Issue> filterByAuthor (String authorName){
       Collection<Issue> allIssues = repository.getAll();
       allIssues.removeIf(issue -> !(issue.getAuthor().getName() == authorName));
        return allIssues;
    }

    public Collection<Issue> filterByAssignee (String assigneeName){
        Collection<Issue> allIssues = repository.getAll();
        allIssues.removeIf(issue -> !(issue.getAssignee().getName() == assigneeName));
        return allIssues;
    }
    /**
     * Не понимаю как получить объект из сета, чтоб сравнить по строке. Если сделать на вход объект, а не строку, то все просто
     */
//    public Collection<Issue> filterByLabel (String labelName){
//        Collection<Issue> allIssues = repository.getAll();
//        allIssues.removeIf(issue -> !issue.getLabel().equals());
//        return allIssues;
//    }

    /**
     *     Не понимаю как сделать сортировку. В приведенной ниже реализации несоответсвие типов. а мы хотим вседа получать коллекцию на выходе
     */
//    public Collection<Issue> sortById (Collection<? extends Issue> issues){
//        return (Collection<Issue>) issues.stream().sorted(IdComporator);
//    }
//    public Collection<Issue> sortByIdReversed (Collection<? extends Issue> issues){
//        return (Collection<Issue>) issues.stream().sorted(IdComporator.reversed());
//    }

}
