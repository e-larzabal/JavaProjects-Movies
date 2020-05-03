
public class Movies {

	
	public static void main(String[] args){ 
		// 1er tableau contenant 3 titres de films dans lesquels joue notre ami Indiana
		String[] Titles = new String[3];
		// 2nd tableau contenant, pour chaque film, les 3 principaux acteurs
		String[][] FirstActors = new String [3][3];
		// variables pour afficher le résultat
		String title, actor1, actor2, actor3;
		
		// Initialisation des deux tableaux
		// -1er film 
		Titles[0]="Indiana Jones et le Royaume du Crâne de Cristal";
		FirstActors[0][0]="Harrison Ford";
		FirstActors[0][1]="Cate Blanchett";
		FirstActors[0][2]="Karen Allen";
		
		// -2nd film
		Titles[1]="Indiana Jones et la Dernière Croisade";
		FirstActors[1][0]="Harrison Ford";
		FirstActors[1][1]="Sean Connery";
		FirstActors[1][2]="Denholm Elliott";
		
		// -3ème film
		Titles[2]="Indiana Jones et le Temple maudit";
		FirstActors[2][0]="Harrison Ford";
		FirstActors[2][1]="Kate Capshaw";
		FirstActors[2][2]="Jonathan Ke Quan";		
		
		
		// Boucle d'affichage du contenu des deux tableaux
		for (int i=0;i<3;i++) {
			title  = Titles[i];
			actor1 = FirstActors[i][0];
			actor2 = FirstActors[i][1];
			actor3 = FirstActors[i][2];
			System.out.println("Dans le film "+title+", les principaux acteurs sont : "+actor1+", "+actor2+", "+actor3);
		}		
		 
	 } 
}
