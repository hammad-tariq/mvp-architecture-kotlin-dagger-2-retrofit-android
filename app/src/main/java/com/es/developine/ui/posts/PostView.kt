package com.es.developine.ui.posts

import com.es.developine.data.PostData

interface PostView {

    fun showAllPosts(postList: List<PostData>)
}