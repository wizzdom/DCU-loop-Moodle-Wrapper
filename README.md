# TU-Darmstadt-Moodle-Wrapper
Android app that wrapps moodle to support URLs of the Moddle servers of the TU Darmstadt.

![Screenshot to illustrate the app](fastlane/metadata/android/en-US/images/screenshot_1.png)

## Disclaimer
Neither is this an officail project by the TU Darmstadt nor by Moodle. This is just started by me, a student at the TU Darmstadt, that has to much spare time.

## You can download and install the app for free [here](https://github.com/JonasBernard/TU-Darmstadt-Moodle-Wrapper/releases/download/v1.0/TU-Darmstadt-Moodle-Wrapper.apk).

The Moodle at the TU Darmstadt regularly sends me mails with Moodle links to courses, forum posts and other conent on Moodle. I always read those
mails on my android phone, but clicking on those links from the mails results in opening the browser. I installed the [official Moodle App](https://play.google.com/store/apps/details?id=com.moodle.moodlemobile), and wanted the links to open in the Moodle App.
As this is not nativly supported by the Moodle App, I sat down and coded this little app, that redirects links to the Moodle App.

After the app was finished, I wondered, if someone else could find this useful. The app is minimal and easy to use. Just install it, and all
supported links can be opened in Moodle.

# Prerequisites
You will need to have and android phone with at least Android 6.0 Marshmallow and the [official Moodle App](https://play.google.com/store/apps/details?id=com.moodle.moodlemobile) with at least version 2 installed.

# I get a warning from Google Play Protect, what should I do?
I did not upload the app to Google beacause this app is not published to the Google Play Store. Your Android phone may recognize this and warn you.
You  can ignore this,it just means the code of the app has not been reviewed by an emlopyee at Google.

If you do not trust me and understand Java and Android development, you can read the code and see what it does. Hint: 
Most of the interesting stuff happens [here](app/src/main/AndroidManifest.xml) and [here](app/src/main/java/de/jonasbernard/tudarmstadtmoodlewrapper/MainActivity.java).

# Which moodle links are supported?
This app supports the folloing Moodle URLs (https only):
- moodle.tu-darmstadt.de (standard Moodle)
- moodle.informatik.tu-darmstadt.de (computer science Moodle)
- vorkurs.mathematik.tu-darmstadt.de/moodlevorkurs (Moodle for the mathematicans preliminary course)
- wwwdid.mathematik.tu-darmstadt.de/moodle (some other probably outdated Moodle installation I found)

If the TU Darmstadt has any other Moodle URLs I should include, [open an issue and let me know](https://github.com/JonasBernard/TU-Darmstadt-Moodle-Wrapper/issues/new).

# How to uninstall the app?
The app won't show up on your home screen. This is intended, as there is no need for a home screen icon.
You can uninstall the app anyway by goning to your System Settings -> Apps -> search for "TU Darmstadt Moodle Wrapper".

# License
Moodle and the Moodle logo are trademarks of Moodle Pty Ltd.

The use of the Moodle trademark and logo follow the [Moodle Brand Guidlines](https://moodle.org/pluginfile.php/2840042/mod_page/content/23/Moodle%20Brand%20Style%20Guide.pdf).


    Copyright (C) 2020 Jonas Bernard

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
