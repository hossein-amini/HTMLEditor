package ir.appturi.rtexteditorview;


import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static ir.appturi.rtexteditorview.ToolType.ALIGN_CENTER;
import static ir.appturi.rtexteditorview.ToolType.ALIGN_JUSTIFY;
import static ir.appturi.rtexteditorview.ToolType.ALIGN_LEFT;
import static ir.appturi.rtexteditorview.ToolType.ALIGN_RIGHT;
import static ir.appturi.rtexteditorview.ToolType.BOLD;
import static ir.appturi.rtexteditorview.ToolType.CLEAR;
import static ir.appturi.rtexteditorview.ToolType.CODE;
import static ir.appturi.rtexteditorview.ToolType.EDIT_HTML;
import static ir.appturi.rtexteditorview.ToolType.H1;
import static ir.appturi.rtexteditorview.ToolType.H2;
import static ir.appturi.rtexteditorview.ToolType.H3;
import static ir.appturi.rtexteditorview.ToolType.H4;
import static ir.appturi.rtexteditorview.ToolType.H5;
import static ir.appturi.rtexteditorview.ToolType.H6;
import static ir.appturi.rtexteditorview.ToolType.HORIZONTAL_RULE;
import static ir.appturi.rtexteditorview.ToolType.INDENT;
import static ir.appturi.rtexteditorview.ToolType.ITALIC;
import static ir.appturi.rtexteditorview.ToolType.LINK;
import static ir.appturi.rtexteditorview.ToolType.NONE;
import static ir.appturi.rtexteditorview.ToolType.NORMAL;
import static ir.appturi.rtexteditorview.ToolType.ORDERED_LIST;
import static ir.appturi.rtexteditorview.ToolType.OUTDENT;
import static ir.appturi.rtexteditorview.ToolType.QUOTE;
import static ir.appturi.rtexteditorview.ToolType.REMOVE_FORMAT;
import static ir.appturi.rtexteditorview.ToolType.STRIKETHROUGH;
import static ir.appturi.rtexteditorview.ToolType.SUBSCRIPT;
import static ir.appturi.rtexteditorview.ToolType.SUPERSCRIPT;
import static ir.appturi.rtexteditorview.ToolType.TABLE;
import static ir.appturi.rtexteditorview.ToolType.TEXT_BACK_COLOR;
import static ir.appturi.rtexteditorview.ToolType.TEXT_FORE_COLOR;
import static ir.appturi.rtexteditorview.ToolType.UNDERLINE;
import static ir.appturi.rtexteditorview.ToolType.UNLINK;
import static ir.appturi.rtexteditorview.ToolType.UNORDERED_LIST;

@IntDef({
        NONE, BOLD, ITALIC, UNDERLINE, STRIKETHROUGH, REMOVE_FORMAT, NORMAL, H1, H2, H3, H4, H5, H6,
        SUPERSCRIPT, SUBSCRIPT, TEXT_FORE_COLOR, TEXT_BACK_COLOR, CODE, UNORDERED_LIST,
        ORDERED_LIST, QUOTE, ALIGN_LEFT, ALIGN_CENTER, ALIGN_RIGHT, ALIGN_JUSTIFY, HORIZONTAL_RULE,
        INDENT, OUTDENT, TABLE, LINK, UNLINK, CLEAR, EDIT_HTML
})
@Retention(RetentionPolicy.SOURCE)
public @interface ToolType {
    int NONE = 0;
    int BOLD = 1;
    int ITALIC = 2;
    int UNDERLINE = 3;
    int STRIKETHROUGH = 4;
    int REMOVE_FORMAT = 5;
    int NORMAL = 6;
    int H1 = 7;
    int H2 = 8;
    int H3 = 9;
    int H4 = 10;
    int H5 = 11;
    int H6 = 12;
    int SUPERSCRIPT = 13;
    int SUBSCRIPT = 14;
    int TEXT_FORE_COLOR = 15;
    int TEXT_BACK_COLOR = 16;
    int CODE = 17;
    int UNORDERED_LIST = 18;
    int ORDERED_LIST = 19;
    int QUOTE = 20;
    int ALIGN_LEFT = 21;
    int ALIGN_CENTER = 22;
    int ALIGN_RIGHT = 23;
    int ALIGN_JUSTIFY = 24;
    int HORIZONTAL_RULE = 25;
    int INDENT = 26;
    int OUTDENT = 27;
    int TABLE = 28;
    int LINK = 29;
    int UNLINK = 30;
    int CLEAR = 31;
    int EDIT_HTML = 32;
}
