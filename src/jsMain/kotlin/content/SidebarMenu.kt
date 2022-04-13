package content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.CSSNumeric
import org.jetbrains.compose.web.css.keywords.CSSAutoKeyword
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.*

@Composable
fun SidebarMenu() {
    Div({ classes("sidebar-menu", "toggle-others", "fixed") }) {
        Div({ classes("sidebar-menu-inner") }) {
            Header({ classes("logo-env") }) {
                Div({ classes("logo") }) {
                    A(href = "index.html", attrs = { classes("logo-expanded") }) {
                        Img(
                            src = "/assets/images/logo@2x.png",
                            alt = "",
                            attrs = { style { width(100.percent) } }
                        )
                    }
                    A(href = "index.html", attrs = { classes("logo-collapsed") }) {
                        Img(
                            src = "/assets/images/logo-collapsed@2x.png",
                            alt = "",
                            attrs = { style { width(40.percent) } }
                        )
                    }
                }
                Div({ classes("mobile-menu-toggle", "visible-xs") }) {
                    A(href = "#", attrs = { attr("data-toggle", "user-info-menu") }) {
                        I({ classes("linecons-cog") })
                    }
                    A(href = "#", attrs = { attr("data-toggle", "mobile-menu") }) {
                        I({ classes("fa-bars") })
                    }
                }
            }
            Ul({ id("main-menu"); classes("main-menu") }) {
                Li {
                    A(href = "#常用推荐", attrs = { classes("smooth") }) {
                        I({ classes("linecons-star") })
                        Span({ classes("title") }) {
                            Text("常用推荐")
                        }
                    }
                }
                Li {
                    A(href = "#社区资讯", attrs = { classes("smooth") }) {
                        I({ classes("linecons-doc") })
                        Span({ classes("title") }) {
                            Text("社区资讯")
                        }
                    }
                }
                Li {
                    A {
                        I({ classes("linecons-lightbulb") })
                        Span({ classes("title") }) {
                            Text("灵感采集")
                        }
                    }
                    Ul {
                        Li {
                            A(href = "#发现产品", attrs = { classes("smooth") }) {
                                Span({ classes("title") }) {
                                    Text("发现产品")
                                }
                            }
                        }
                        Li {
                            A(href = "#界面灵感", attrs = { classes("smooth") }) {
                                Span({ classes("title") }) {
                                    Text("界面灵感")
                                }
                                Span({ classes("label", "label-pink", "pull-right", "hidden-collapsed") }) {
                                    Text("Hot")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}