package repository;

import domain.Issue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class IssuesRepository {
    private Collection<Issue> issues = new LinkedList<>();

    public boolean add (Issue newIssue){
        return issues.add(newIssue);
    }

    public Collection<Issue> getAll(){
        return  issues;
    }

    public Issue getById (int id){
        for (Issue findIssue: issues) {
            if (findIssue.getId()==id)
                return findIssue;
        }
        return null;
    }

    public Collection<Issue> removeById (int id){
        for (Issue removeIssue: issues) {
            if (removeIssue.getId()==id)
                issues.remove(removeIssue);
            return issues;
        }
        return null;
    }

    public boolean remove(Issue issue) {
    return issues.remove(issue);
  }

    public boolean addAll(Collection<? extends Issue> issues) {
    return this.issues.addAll(issues);
  }

    public boolean removeAll(Collection<? extends Issue> issues) {
        return this.issues.removeAll(issues);
    }
}
