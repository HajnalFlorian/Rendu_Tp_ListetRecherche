package com.example.tppatisserie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private final String EXTRA_PAT_RES = "recette";
    private final String EXTRA_PAT_IMG="image";
    private void initList(ArrayList<Cpatisserie> patisseriesList){
        Cpatisserie patisserie = new Cpatisserie();
        patisserie.setNomPatisserie("Baba au Rhum");
        patisserie.setDesPatisserie("Le baba au rhum est un dessert compose d'un gateau brioche arrose de rhum et generalement accompagne de chantilly ou de creme patissiere. L'origine de cette patisserie remonte sans doute au XVIIIe siecle.");
        patisserie.setImagePatisserie(R.drawable.baba);
        patisserie.setRecettePatisserie("Ajouter le lait chaud,\n" +
                "le beurre fondu,\n" +
                "la farine et la levure.\n" +
                "Battre les blancs en neige ferme.\n" +
                "Mélanger les délicatement à la pâte.\n" +
                "Verser la pâte dans un moule en couronne préalablement beurré ou dans des moules individuels. Enfourner et laisser cuire 25 min puis démouler aussitôt.\n" +
                "Faire le sirop chaud avec l'eau, le sirop de sucre de canne et le rhum\n" +
                "et en arroser le baba jusqu'à complète absorbtion.\n" +
                "Server frais avec une salade de fruits ou/et de la chantilly.\n" +
                "Et déguster");
        patisseriesList.add(patisserie);
        Cpatisserie eclair = new Cpatisserie();
        eclair.setNomPatisserie("Eclair");
        eclair.setDesPatisserie("Un éclair, anciennement appelé pain à la duchesse (avant 1850)1 ou petite duchesse2, est une pâtisserie d'origine française constituée de pâte à choux allongée et fourrée de crème pâtissière, avec un glaçage sur le dessus.");
        eclair.setImagePatisserie(R.drawable.eclair);
        eclair.setRecettePatisserie("Pour la pâte à choux:\n" +
                "Préchauffer le four à 210°C (Thermostat 7).\n" +
                "Mélanger sel, sucre, beurre et eau dans une casserole, et faire bouillir.\n" +
                "Intégrer la farine, et remuer jusqu'à l'obtention d'une pâte compacte. La travailler jusqu'à ce qu'elle soit suffisamment ferme\n" +
                "Intégrer 4 oeufs, un à un en veillant à bien mélanger entre chaque oeuf.\n" +
                "Travailler la pâte afin de la rendre ferme.\n" +
                "Sur un plaque allant au four préalablement huilée, répartir à l'aide de la poche à douille une dizaine de boudins de pâte de 15 cm de long environ.\n" +
                "Badigeonner avec le jaune d'œuf pour que la pâte soit dorée à la cuisson .\n" +
                "Faire cuire 25 min à four chaud et laisser reposer 10 min, four éteint, pour éviter que les choux ou les éclairs ne dégonflent.\n" +
                "Pour la crème:\n" +
                "Faire fondre 60 g de chocolat cassé en morceaux dans le lait, à feu doux .\n" +
                "Dans un bol, fouetter oeuf, jaune et sucre jusqu'à ce que le mélange soit mousseux.\n" +
                "Ajouter la farine et verser dans le lait chocolaté.\n" +
                "Faire épaissir sans cesser de remuer.\n" +
                "Hors du feu, intégrer 20 g de beurre. Laisser refroidir.\n" +
                "Garnir de cette crème les éclairs coupés en 2 dans le sens de la longueur et faire fondre au bain-marie le reste du chocolat et du beurre.\n" +
                "Napper le dessus des éclairs. Laisser durcir le glaçage avant de déguster.");
        patisseriesList.add(eclair);
        Cpatisserie tartelette = new Cpatisserie();
        tartelette.setNomPatisserie("Fraisier");
        tartelette.setImagePatisserie(R.drawable.fraisier);
        tartelette.setDesPatisserie("Le fraisier est une pâtisserie à base de fraises, de génoise, de crème et souvent recouverte d'une mince couche de pâte d'amande (la plupart du temps rose).");
        tartelette.setRecettePatisserie("Réalisez le sirop en faisant chauffer l'eau, le sucre et la gousse de vanille fendue. Portez à ébullition 2/3 minutes et laissez infuser. Vous pouvez également ajouter du kirsch, du sirop de fraise ou autre...\n" +
                "Réalisez la crème en chauffant le lait avec la gousse de vanille fendue (ou l'extrait de vanille ou sucre vanillé, au choix :)\n" +
                "Fouettez les jaunes avec le sucre, ajoutez la maizéna ensuite, progressivement\n" +
                "Ajoutez l'agar agar dans le lait et laissez bouillir 1 minute\n" +
                "Versez le lait bouillant dessus en une fois, mélangez et remettez sur le feu moyen, fouettez constamment, la crème pâtissière va s'épaissir\n" +
                "Reversez la crème dans un bol propre, couvrez-la au contact avec du film alimentaire et laissez refroidir.\n" +
                "Fouettez la crème liquide bien ferme (mettez-la au congélateur 15 minutes avant, ca aide !!)\n" +
                "Ajoutez la crème fouettée à la crème pâtissière froide, délicatement, et mettez dans une poche à douille au frais.\n" +
                "Réalisez la génoise à présent : séparez les blancs des jaunes et battez les blancs bien fermes\n" +
                "Ajoutez un tiers du sucre aux blancs quand ils sont fermes, et battez encore 1 minute.\n" +
                "Fouettez les jaunes avec le restant de sucre et la vanille\n" +
                "Ajoutez le beurre fondu, puis la moitié de la farine tamisée\n" +
                "Pour détendre la pâte, ajoutez 2 c. à soupe de blanc d'oeufs\n" +
                "Puis ajoutez le reste de la farine\n" +
                "Enfin, ajoutez les blancs d'oeufs délicatement en soulevant la pâte pour ne pas casser les bulles d'air !\n" +
                "Versez la pâte dans deux cercles (ou sur une plaque, vous pourrez découper les cercles après cuisson...)\n" +
                "Enfournez à four chaud 10 minutes à 190°C\n" +
                "Imbibez les génoises du sirop dès la sortir du four\n" +
                "Procédez au montage du fraisier : disposez un cercle de génoise dans votre cercle ou moule à charnière\n" +
                "Découpez les fraises en deux dans le sens de la hauteur et disposez-les face tranchée vers l'extérieur\n" +
                "Plaquez bien les fraises contre le bord avec la crème, et complétez l'intérieur avec la crème et des morceaux de fraises\n" +
                "Recouvrez avec le 2e cercle de génoise, et décorez avec de la pâte à sucre, de la pâte d'amande étalée au rouleau, ou encore un glaçage blanc royal (blanc d'oeuf, sucre glace et jus de citron)\n" +
                "Placez au frais entre 2 heures et une nuit avant de démouler et de servir.");
        patisseriesList.add(tartelette);
        Cpatisserie kougelhopf = new Cpatisserie();
        kougelhopf.setNomPatisserie("Kougelhopf");
        kougelhopf.setDesPatisserie("Il s'agit d'une brioche à pâte levée, dont l'apparence est caractéristique en raison de son moule, qui lui donne une forme haute, cannelée et creusée en son milieu. Le kouglof peut être sucré, avec des raisins secs imbibés de rhum ou de kirsch et des amandes, ou salé, avec des lardons et des noix. Cette spécialité a été pendant longtemps un gâteau de célébration, préparé pour de multiples occasions : Noël, mariage, naissance, fête de village, etc. Il est plutôt dégusté, de nos jours, au petit déjeuner en version sucrée, et à l’apéritif dans sa version salée");
        kougelhopf.setRecettePatisserie("Tremper les raisins dans de l'eau tiède pour les faire gonfler.\n" +
                "Mélanger la levure à 10 cl de lait et un peu de farine pour en faire une pâte à laisser reposer jusqu'à doublement de son volume.\n" +
                "Mélanger la farine restante, le sel, le sucre, les oeufs et les 10cl de lait restants. Pétrir pendant 15 mn pour bien aérer la pâte.\n" +
                "Ajouter le beurre ramolli et bien mélanger.\n" +
                "Ajouter ensuite le levain, puis pétrir quelques minutes jusqu'à ce que la pâte se détache des bords du récipient.\n" +
                "Couvrir d'un linge et laisser reposer pendant 1h dans un endroit tempéré (près d'un radiateur par exemple).\n" +
                "Faire reprendre à la pâte son volume initial en la tapotant.\n" +
                "Ajouter les raisins et mélanger.\n" +
                "Bien beurrer le moule à kougelhopf jusque dans les cannelures. Déposer une amande dans chaque cannelure. Y mettre la pâte et laisser reposer jusqu'à ce qu'elle arrive au bord du moule.\n" +
                "Cuire 50 minutes à thermostat 7 (200-210°C). Si la pâte se colore de trop, couvrir d'un papier sulfurisé.\n" +
                "Démouler sur une grille et saupoudrer généreusement de sucre glace.");
        kougelhopf.setImagePatisserie(R.drawable.kougelhopf);
        patisseriesList.add(kougelhopf);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Cpatisserie> patisseriesList = new ArrayList<Cpatisserie>();
        initList(patisseriesList);
        final PatisserieAdapter adapter = new PatisserieAdapter(this,R.layout.layoutlist,patisseriesList);
        ListView list = (ListView)findViewById(R.id.activity_main_list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,Activity_Affichage.class );
                Cpatisserie select = (Cpatisserie) adapter.getItemAtPosition(position);
                intent.putExtra(EXTRA_PAT_RES,select.getRecettePatisserie() );
                intent.putExtra(EXTRA_PAT_IMG,select.getImagePatisserie());
                startActivity(intent);
            }
        });
        SearchView search = (SearchView)findViewById(R.id.activity_main_search);
        final TextView rechercher=(TextView)findViewById(R.id.activity_main_empty);
        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query);
                if (adapter.getCount()==0){
                    rechercher.setVisibility(View.VISIBLE);
                }
                else{
                    rechercher.setVisibility(View.GONE);
                }
                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                if (adapter.getCount()==0){
                    rechercher.setVisibility(View.VISIBLE);
                }
                else{
                    rechercher.setVisibility(View.GONE);
                }
                return false;
            }
        });

    }
}
