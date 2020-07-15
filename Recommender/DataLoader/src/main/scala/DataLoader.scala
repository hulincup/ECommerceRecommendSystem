/**
 * @Author lynn
 * @Date 2020/7/15 17:42
 */

/**
 * Product数据集
 * 3982                             商品ID  productID
 * Fuhlen 富勒 M8眩光舞者时尚节能    商品名称   name
 * 1057,439,736                     商品分类ID，不需要
 * B009EJN4T2                       亚马逊ID，不需要
 * https://images-cn-4.ssl-image    商品的图片URL  imageUrl
 * 外设产品|鼠标|电脑/办公           商品分类   categories
 * 富勒|鼠标|电子产品|好用|外观漂亮   商品UGC标签  tags
 */
case class Product(productID: Int, name: String, imageUrl: String, categories: String, tags: String)

/**
 * Rating数据集
 * 4867        用户ID
 * 457976      商品ID
 * 5.0         评分
 * 1395676800  时间戳
 */
case class Rating(userId: Int, productId: Int, score: Double, timestamp: Int)

object DataLoader {

}
