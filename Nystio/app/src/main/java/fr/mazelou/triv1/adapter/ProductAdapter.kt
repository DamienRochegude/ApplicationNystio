package fr.mazelou.triv1.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fr.mazelou.triv1.MainActivity
import fr.mazelou.triv1.ProductModel
import fr.mazelou.triv1.R

class ProductAdapter(private val context: MainActivity, private val productList: List<ProductModel> ,private val layoutProductId: Int) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    // Boite pour ranger les composants a controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // Image du produit
        val productImage = view.findViewById<ImageView>(R.id.image_product)
        // Nom du produit
        val productName = view.findViewById<TextView>(R.id.name_product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutProductId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Récupérer les informations du produits
        val currentProduct = productList[position]

        // Utiliser Glide pour récupérer l'image à partir de son lien -> puis l'ajouter à son composant
        Glide.with(context).load(Uri.parse(currentProduct.imageUrl)).into(holder.productImage)

        // Mettre à jour le nom du produit
        holder.productName.text = currentProduct.name
    }

    override fun getItemCount(): Int = productList.size

}