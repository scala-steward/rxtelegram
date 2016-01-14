package net.rfc1149.rxtelegram.model

import net.rfc1149.rxtelegram.Bot.ParseMode
import play.api.libs.json.{Json, Writes}

case class InlineQueryResultVideo(id: String, video_url: String, mime_type: String,
                                  message_text: String, parse_mode: Option[ParseMode] = None,
                                  disable_web_page_preview: Option[Boolean] = None,
                                  video_width: Option[Long] = None, video_height: Option[Long] = None,
                                  video_duration: Option[Long] = None, thumb_url: Option[String] = None,
                                  title: Option[String] = None,
                                  description: Option[String] = None)

object InlineQueryResultVideo {
  implicit val inlineQueryResultVideoWrites: Writes[InlineQueryResultVideo] = Writes { iqrv =>
    Json.writes[InlineQueryResultVideo].writes(iqrv) ++ Json.obj("type" -> "video")
  }
}
