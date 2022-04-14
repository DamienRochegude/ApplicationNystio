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
import fr.mazelou.triv1.MaterialModel
import fr.mazelou.triv1.ProductModel
import fr.mazelou.triv1.R
import org.w3c.dom.Text

class MaterialAdapter(private val context: MainActivity, private val materialList: List<MaterialModel>, private val layoutMaterialId: Int): RecyclerView.Adapter<MaterialAdapter.ViewHolder>(){

    // Boite pour ranger les composants a controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // Image du matériau
        val materialImage = view.findViewById<ImageView>(R.id.image_material)
        // Nom du matériau
        val materialName = view.findViewById<TextView>(R.id.name_material)
        // Information du matériau
        val materialInfo = view.findViewById<TextView>(R.id.info_material)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutMaterialId, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Récupérer les informations du matériau
        val currentMaterial = materialList[position]

        // Utiliser Glide pour récupérer l'image à partir de son lien -> puis l'ajouter à son composant
        Glide.with(context).load(Uri.parse(currentMaterial.imageUrl)).into(holder.materialImage)

        // Mettre à jour le nom du produit
        holder.materialName.text = currentMaterial.name

        // Mettre à jour l' information du matériau
        holder.materialInfo.text = currentMaterial.info

    }

    override fun getItemCount(): Int = materialList.size
}