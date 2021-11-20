package com.turicticapp.turisticapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class SitiosAdapter(
    private val sitiosList: ArrayList<SitioItem>
) : RecyclerView.Adapter<SitiosAdapter.SitioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_sitio_item, parent, false)
        return SitioViewHolder(view)
    }

    override fun onBindViewHolder(holder: SitioViewHolder, position: Int) {
    val sitio = sitiosList[position]
        holder.bind(sitio)
    }

    override fun getItemCount(): Int = sitiosList.size

    class SitioViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private var nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        private var descriptionTextView: TextView = itemView.findViewById(R.id.description_text_view)
        private var scoreTextView: TextView = itemView.findViewById(R.id.score_text_view)
        private var pictureImageView: ImageView = itemView.findViewById(R.id.picture_image_view)

        fun bind(sitio: SitioItem){
            nameTextView.text = sitio.name
            descriptionTextView.text = sitio.description
            scoreTextView.text = sitio.score
            Picasso.get().load(sitio.urlPicture).into(pictureImageView)
        }
    }

}