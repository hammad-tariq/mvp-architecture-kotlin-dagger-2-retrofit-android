package com.es.developine.ui.posts

import com.es.developine.data.PostData
import com.es.developine.ui.IView

interface PostView: IView {

    fun showAllPosts(postList: List<PostData>)
}