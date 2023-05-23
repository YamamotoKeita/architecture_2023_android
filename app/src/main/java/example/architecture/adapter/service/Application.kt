package example.architecture.adapter.service

interface Application {
    val version: String

    fun showNoticeAlert(title: String?, message: String) {
        showAlert(
            title = title,
            message = message,
            buttons = listOf(AlertButton(label = "OK", action = null))
        )
    }
    fun showAlert(title: String?, message: String, buttons: List<AlertButton>)
    fun openBrowser(url: String)
}

data class AlertButton(
    val label: String,
    val action: (() -> Unit)?
)
