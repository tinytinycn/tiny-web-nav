package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.dom.*

@Composable
fun ContentFooter() {
    Footer({ classes("main-footer", "sticky", "footer-type-1") }) {
        Div({ classes("footer-inner") }) {
            Div({ classes("footer-text") }) {
                Text("© 2022 ")
                A(href = "/index.html", attrs = { style { } }) {
                    Em { Text("TinyNav. ") }
                }
                Text("design by tinytinycn")
            }
            Div({ classes("go-up") }) {
                A(href = "#", attrs = { attr("rel", "go-top") }) {
                    I({ classes("fa-angle-up") })
                }
            }
        }
    }
}
