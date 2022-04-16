package day31_Constructors.TASKS;

public class MovieObjects {

    public static void main(String[] args) {


        String gene = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", title, gene, "10/25/2021", "Kuzzat Altay");
        movie1.addCasts(casts);

        System.out.println(movie1);
        System.out.println("Movie cast:" + "\t\t\t\t\t\t" + movie1.casts);
        movie1.addCast("Arlind");
        System.out.println("Movie cast after i add myself: " + movie1.casts);
        System.out.println();




        Movie movie2 = new Movie("Germany", title, gene, "09/12/2021", "Hitchcock" );
        System.out.println(movie2);
    }

}


/*
3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

                    print the full info of the movie
                    */