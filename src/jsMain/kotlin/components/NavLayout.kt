package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*

@Composable
fun PageLayout(content: @Composable () -> Unit) {
    Div({ classes("page-container") }) {
        content()
    }
}

@Composable
fun ContentLayout(content: @Composable () -> Unit) {
    Div({ classes("main-content") }) {
        content()
    }
}