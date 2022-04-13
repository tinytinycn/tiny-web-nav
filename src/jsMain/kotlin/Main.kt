import components.ContentLayout
import components.PageLayout
import components.WebsiteCards
import content.ContentFooter
import content.ContentNav
import content.SidebarMenu
import dataprovider.getCards
import dataprovider.getCards2
import dataprovider.getCards3
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        PageLayout {
            SidebarMenu()
            ContentLayout {
                ContentNav()
                WebsiteCards(title = "常用推荐", cards = getCards())
                WebsiteCards(title = "发现产品", cards = getCards2())
                WebsiteCards(title = "界面灵感", cards = getCards3())
                ContentFooter()
            }
        }
    }
}