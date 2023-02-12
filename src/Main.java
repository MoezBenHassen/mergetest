import Entities.Utilisateur;
import Services.UtilisateurService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Utilisateur u1 = new Utilisateur(67,"mm","prenom mm ", "imageURL");
        156
            utilisateurService.add(u1);
            System.out.println(utilisateurService.afficher());
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}