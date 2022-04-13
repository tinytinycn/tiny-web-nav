package components

import androidx.compose.runtime.Composable
import kotlinx.browser.window
import org.jetbrains.compose.web.css.marginRight
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

data class WebsiteCardData(val linkTitle: String, val iconUrl: String, val linkUrl: String, val linkDesc: String)

@Composable
private fun WebsiteCard(cardData: WebsiteCardData) {
    Div({
        classes("xe-widget", "xe-conversations", "box2", "label-info")
        attr("data-toggle", "tooltip")
        attr("data-placement", "bottom")
        title("")
        attr("data-original-title", cardData.linkUrl)
        onClick { window.open(url = cardData.linkUrl, target = "_blank") }
    }) {
        Div({ classes("xe-comment-entry") }) {
            A(attrs = { classes("xe-user-img") }) {
                Img(src = cardData.iconUrl,
                    attrs = {
                        attr("data-src", cardData.iconUrl)
                        classes("lozad", "img-circle")
                        attr("width", "40")
                    }
                )
            }
            Div({ classes("xe-comment") }) {
                A(href = "#", attrs = { classes("xe-user-name", "overflowClip_1") }) {
                    Text(cardData.linkTitle)
                }
                P({ classes("overflowClip_2") }) {
                    Text(cardData.linkDesc)
                }
            }
        }
    }
}

@Composable
fun WebsiteCards(
    title: String,
    cards: List<WebsiteCardData>
) {
    H4({ classes("text-gray") }) {
        I({ id(title); classes("linecons-tag"); style { marginRight(7.px) } })
        Text(title)
    }
    for (i in cards.indices) {
        if (i % 4 == 0) {
            val subList = cards.subList(i, if (i + 4 < cards.size) (i + 4) else cards.size)
            Div({ classes("row") }) {
                subList.forEach {
                    Div({ classes("col-sm-3") }) {
                        WebsiteCard(it)
                    }
                }
            }
        }
    }
    Br { }
}