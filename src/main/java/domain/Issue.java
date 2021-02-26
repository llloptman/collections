package domain;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Issue {
    private HashSet<User> author = new HashSet<>() ;
    private HashSet<Label> label = new HashSet<>();
    private HashSet<Project> project = new HashSet<>();
    private String milestones;
    private HashSet<User> assignee = new HashSet<>() ;
    private boolean isOpen;

}
