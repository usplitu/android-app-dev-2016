#Introduction

This is a simple Android app that demonstrates how to create a grid of radio buttons. I nested the buttons within a RadioGroup as a first attempt. This failed since the RadioGroup extends a LinearLayout which provides for either horizontal or vertical orientation but not both simultaneously.
The Udacity-hosted Material Design for Android Developers contains a demo application named ImmersiveImages that has a group of nine radio buttons arranged in two columns.  My code is a simplified version of this app. 

#Quick Start
1. Clone the repo [android-grid-radio-buttons.](https://github.com/usplitu/android_grid_radio_buttons.git)
2. Build in Android Studio. 
If necessary, modify *build.gradle* to align with your installed packages. Alternative install any missing packages.
3. Install and run on a device or emulator.
4. Exercise the radio buttons, observing the button behaviour and the changes to the image.

#Code
The Material Design for Android Developers MOOC app, *ImmersiveImages* uses the [Butterknife library](http://jakewharton.github.io/butterknife/). The sample app employs Butterknife in a branch named **butterknife.**
The **master** branch uses the conventional Android programming approach.

