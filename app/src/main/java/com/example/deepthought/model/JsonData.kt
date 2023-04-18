package com.example.deepthought.model

data class JsonData(
    val _key: String,
    val cid: Any,
    val description: String,
    val globalTags: List<Any>,
    val lastposttime: Int,
    val learning_outcomes: List<String>,
    val mainPid: Int,
    val postcount: Int,
    val pre_requisites: List<String>,
    val project_image: String,
    val short_description: String,
    val slug: String,
    val start_time: Long,
    val status: String,
    val tasks: List<Task>,
    val tid: Int,
    val timestamp: Long,
    val title: String,
    val tools: List<Any>,
    val type: String,
    val uid: Int,
    val viewcount: Int
) : List<JsonData> {
    data class Task(
        val assets: List<Asset>,
        val task_description: String,
        val task_id: Int,
        val task_title: String,
        val tools: List<Any>
    ) {
        data class Asset(
            val asset_content: String,
            val asset_description: String,
            val asset_id: Int,
            val asset_title: String,
            val asset_type: String,
            val display_asset_docs: String,
            val display_asset_image: String,
            val display_asset_reflection: String,
            val display_asset_url: String,
            val display_asset_video: String,
            val display_eb_pid: Any,
            val display_eb_tid: Any,
            val display_tb_pid: Any,
            val display_tb_tid: Any
        )
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun get(index: Int): JsonData {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<JsonData> {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<JsonData> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<JsonData> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<JsonData> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: JsonData): Int {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: JsonData): Int {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<JsonData>): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(element: JsonData): Boolean {
        TODO("Not yet implemented")
    }
}