// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DepartementHashSet departementHashSet =new DepartementHashSet();

        Departement dep1 =new Departement(1,"Departement Dev",1);
        Departement dep2 =new Departement(2,"Departement Reseau",2);
        Departement dep3 =new Departement(3,"Departement HR ",7);

        //AJOUT
        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);
        departementHashSet.ajouterDepartement(dep3);

        //RECHERCHE
        String nom="Departement Dev";
        departementHashSet.rechercherDepartement(nom);
        departementHashSet.rechercherDepartement(dep3);

        //SUPPRIMIER
        departementHashSet.supprimerDepartement(dep1);

        //DISPLAY
        departementHashSet.displayDepartement();

        //TRIER
        departementHashSet.trierDepartementById();

    }
}