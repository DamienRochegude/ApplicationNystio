package fr.mazelou.triv1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import fr.mazelou.triv1.MainActivity
import fr.mazelou.triv1.MaterialModel
import fr.mazelou.triv1.ProductModel
import fr.mazelou.triv1.R
import fr.mazelou.triv1.adapter.MaterialAdapter
import fr.mazelou.triv1.adapter.ProductAdapter

class HomeFragment(private val context: MainActivity) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.fragment_home, container, false)

        // Créer une liste qui va stocker ces produits
        val productList = arrayListOf<ProductModel>()

        // Enregistrer un premier produit
        productList.add(
            ProductModel(
            "S.Pellegrino",
            "https://halalcourses.com/634-large_default/san-pellegrino.jpg"
        ))

        // Enregistrer un second produit
        productList.add(
            ProductModel(
                "Petit Beurre",
                "https://media.houra.fr/ART-IMG-XL/34/80/7622210988034-1.jpg"
            ))

        // Enregistrer un troisième produit
        productList.add(
            ProductModel(
                "Crème Entière",
                "https://media.houra.fr/ART-IMG-XL/24/54/3451791275424-5.jpg"
            ))

        // Enregistrer un quatrième produit
        productList.add(
            ProductModel(
                "Desperados",
                "https://media.houra.fr/ART-IMG-XL/63/64/3119780266463-1.jpg"
            ))

        // Créer une liste qui stocker les matériaux

        val materialList = arrayListOf<MaterialModel>()

        // Enregistrer un premier matériau
        materialList.add(
            MaterialModel(
                "Carton",
                "https://www.lacentraledubureau.com/images/products/42600.jpg",
                "Information sur le carton"
            ))

        // Enregistrer un second matériau
        materialList.add(
            MaterialModel(
                "Verre",
                "https://trivalis.fr/wp-content/uploads/2018/01/Illustration_verre.jpg",
                "Information sur le verre"
            ))

        // Enregistrer un troisième matériau
        materialList.add(
            MaterialModel(
                "Papier",
                "https://www.sicoval.fr/_contents/ametys-internal%253Asites/sicoval/ametys-internal%253Acontents/papier-article/_metadata/content/_data/5-et_les_autres_papiers.jpg",
                "Information sur le papier"
            ))

        // Enregistrer un quatrième matériau
        materialList.add(
            MaterialModel(
                "Métal",
                "https://www.syndicats-lectoure.com/sites/default/files/images/tri-emballage-metal.jpg",
                "Information sur le métal"
            ))

            // Récupérer le premier RecyclerView
        val recyclerViewProduct = view.findViewById<RecyclerView>(R.id.recyclerView_products)
        recyclerViewProduct.adapter = ProductAdapter(context, productList, R.layout.item_vertical_product)

        // Récupérer le second RecyclerView
        val recyclerViewMaterial = view.findViewById<RecyclerView>(R.id.recyclerView_materials)
        recyclerViewMaterial.adapter = MaterialAdapter(context, materialList, R.layout.item_vertical_material)

        return view
    }
}