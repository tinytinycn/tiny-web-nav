package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*

@Composable
fun ContentNav() {
    Nav({ classes("navbar", "user-info-navbar"); attr("role", "navigation") }) {
        Ul({ classes("user-info-menu", "left-links", "list-inline", "list-unstyled") }) {
            Li({ classes("hidden-sm", "hidden-xs") }) {
                A(href = "#", attrs = { attr("data-toggle", "sidebar") }) {
                    I({ classes("fa-bars") })
                }
            }
            Li({ classes("dropdown", "hover-line", "language-switcher") }) {
                A(href = "index.html", attrs = { classes("dropdown-toggle"); attr("data-toggle", "dropdown") }) {
                    Img(src = "/assets/images/flags/flag-cn.png", alt = "flag-cn")
                    Text("Chinese")
                }
            }
        }
        Ul({ classes("user-info-menu", "right-links", "list-inline", "list-unstyled") }) {
            Li({ classes("hidden-sm", "hidden-xs") }) {
                A(href = "https://github.com/tinytinycn", attrs = { target(ATarget.Blank) }) {
                    I({ classes("fa-github") }) {
                        Text("GitHub")
                    }
                }
            }
        }
    }
}