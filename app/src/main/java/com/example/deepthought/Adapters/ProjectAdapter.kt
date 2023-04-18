package com.example.deepthought.Adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.deepthought.R
import com.example.deepthought.TaskActivity
import com.example.deepthought.databinding.ListItemExploreBinding
import com.example.deepthought.model.JsonData


class ProjectAdapter : RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {

    //This Adapter is for the recyclerView which will contain the basic details of the projects in the MainActivity.

    inner class ProjectViewHolder(
         val binding: ListItemExploreBinding) : RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<JsonData>() {
        override fun areItemsTheSame(oldItem: JsonData, newItem: JsonData): Boolean {
            return oldItem.lastposttime == newItem.lastposttime
        }

        override fun areContentsTheSame(oldItem: JsonData, newItem: JsonData): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)
    var projects: List<JsonData>
        get() = differ.currentList
        set(value) { differ.submitList(value) }

    override fun getItemCount() = projects.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        return ProjectViewHolder(ListItemExploreBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.binding.apply {
            val project = projects[position]
            titlePro.text = project.title
            DescPro.text = project.description
            learningOutDescPro.text = project.learning_outcomes[position]
            preRequisitesDesc.text = project.pre_requisites[position]
            typeSelect.text = project.type
            exploreButton.setOnClickListener {

            }
            //nameOfAuthor.text = project.authorName

            //Glide.with(context).load(project.project_image).into(holder.projectImage)
        }
    }
}