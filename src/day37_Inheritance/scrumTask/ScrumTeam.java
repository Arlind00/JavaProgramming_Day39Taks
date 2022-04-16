package day37_Inheritance.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {




    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;


    public ArrayList<Tester> testers =  new ArrayList<>();         // initialise the ArrayList of testers
    public ArrayList<Developer> developers = new ArrayList<>();    // initialise the ArrayList of developers



    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }



    public void addTester(Tester tester){       // allows us to add one tester at a time
        testers.add( tester );
    }

    public void addTesters(Tester[] testers){          // allows us to add multiple testers at a time
        this.testers.addAll(Arrays.asList(testers) );  // because they have the same name we need to write "this.tester"
    }

    public void removeTester(int id){       // allows us to remove one tester at a time
        testers.removeIf( p -> p.id == id);
    }

    public void addDeveloper(Developer developer){      // allows us to add single developer at a time
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){          // allows us to add multiple developer at a time
        this.developers.addAll( Arrays.asList(developers) );    // because they have the same name we need to write "this.developer"
    }

    public void removeDeveloper(int id){                        // allows us to remove one developer at a time
        developers.removeIf( p -> p.id == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }


}


/*
Creat a class named ScrumTeam:
            Variables:
                PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
                testers (ArrayList<Testers>),  developers (ArrayList<Developers>)
            Methods:
                addTester(Tester tester): adds the given tester to testers arraylist
                ddTesters(Tester[] testers): adds the given testers to testers arraylist
                removeTester(int id): removes the tester with the given id from the arraylist of tester
                addDeveloper(Developer developer): adds the given developer to testers arraylist
                addDeveloper(Developer[] developer): adds the given developers to testers arraylist
                removeDeveloper(int id): removes the developer with the given id from the arraylist of developer
                toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */
