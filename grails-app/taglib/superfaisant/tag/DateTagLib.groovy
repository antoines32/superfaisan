package superfaisant.tag

class DateTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    def dateFormat = { attrs, body ->
        if (attrs.date != null) {
            out << new java.text.SimpleDateFormat(attrs.format).format(attrs.date)
        }
        else {
            out << ""
        }
    }
}
