# TU-Darmstadt-Moodle-Wrapper
Android app that wrapps moodle to support URLs of the moddle servers of the TU Darmstadt.

## You can download and install the app for free [here](https://github.com/JonasBernard/TU-Darmstadt-Moodle-Wrapper/releases/download/v1.0/TU-Darmstadt-Moodle-Wrapper.apk).

The moodle at the TU Darmstadt regularly sends me mails with moodle links to courses, forum posts and other conent on moodle. I always read those
mails on my android phone, but clicking on those links from the mails results in opening the browser. I installed the [official moodle app](https://play.google.com/store/apps/details?id=com.moodle.moodlemobile&hl=de&gl=US), and wanted the links to open in the moodle app.
As this is not nativly supported by the moodle app, I sat down and coded this little app, that redirects links to the moodle app.

After the app was finished, I wondered, if someone else could find this useful. The app is minimal and easy to use. Just install it, and all
supported links can be opened in moodle.

## Prerequisites
You will need to have and android phone with at least Android 6.0 Marshmallow and the [official moodle app](https://play.google.com/store/apps/details?id=com.moodle.moodlemobile&hl=de&gl=US) with at leaset version 2 installed.

## Which moodle links are supported?
This app supports the folloing moodle URLs:
- moodle.tu-darmstadt.de (standard moodle)
- moodle.informatik.tu-darmstadt.de (computer science moodle)
- vorkurs.mathematik.tu-darmstadt.de/moodlevorkurs (moodle for the mathematicans preliminary course)
- wwwdid.mathematik.tu-darmstadt.de/moodle (some other probably outdated moodle installation I found)

If the TU Darmstadt has any other moodle URLs I should include, [open an issue and let me know](https://github.com/JonasBernard/TU-Darmstadt-Moodle-Wrapper/issues/new).

## How to uninstall the app?
The app won't show up on your home screen. This is intended, as there is no need for a home screen icon.
You can uninstall the app anyway by goning to "settings" -> "apps" and search for "TU Darmstadt Moodle Wrapper".

