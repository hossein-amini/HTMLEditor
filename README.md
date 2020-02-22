
Note
------
This library is exactly <a href="https://github.com/jkennethcarino/rtexteditorview"> RTextEditorView </a> with two differences:
1. It supports RTL & LTR pages
2. It does not use bootstrap

It seems the original library does not maintain anymore so I've created this library to add new features like supporting RTL pages

A simple WYSIWYG Editor for Android based on [Summernote][summernote].

Download
------
Add the dependency

```groovy
dependencies {
    implementation 'ir.appturi.rtexteditorview:rtexteditorview:1.0.0'
}
```

Usage
------

**XML usage:**

**RTL pages Example:**
For RTL pages just add pageDirection="rtl" property to the RTextEditorView in your xml
```
<ir.appturi.rtexteditorview.RTextEditorView
        android:id="@+id/editor_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_above="@+id/toolbar_line"
        android:layout_alignParentTop="true"
        app:pageDirection="rtl" />
```