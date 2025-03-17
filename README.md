fun <T : View> ViewGroup.whereMyView(viewId: Int): T? {
    //if ViewGroup's 'Id' is same as 'viewId' return ViewGroup
    if (this.id == viewId) return this as? T
    for (i in 0 until childCount) {
        val child = getChildAt(i)
        if (child.id == viewId) return child as? T
        if (child is ViewGroup) {
            val foundView: T? = child.whereMyView(viewId)
            if (foundView != null) return foundView
        }
    }
    return null
}
