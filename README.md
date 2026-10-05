# Android Activity Lifecycle & Basic UI Demo

**Aim:** Create an Android application to demonstrate the fundamental functions of the Activity Life Cycle and construct a basic User Interface using standard Android properties.

This project is a fundamental exercise in understanding how an Android Activity is rendered on screen and how it transitions through various states when the user interacts with the app or the device.

## 📱 Features Implemented

### 1. Basic UI Construction
* **Layout:** Utilizes a `ConstraintLayout` to perfectly center a `TextView` on the screen.
* **Background:** The Activity layout has a custom yellow background (`android:background="#FFFF00"`).
* **TextView Styling:** Displays a "Hello World" message with specific attributes:
  * **Color:** Android's built-in Holo Blue (`android:textColor="@android:color/holo_blue_bright"`)
  * **Size:** 27 scaled pixels (`android:textSize="27sp"`)
  * **Style:** Both bold and italic (`android:textStyle="bold|italic"`)
  * **ID Generation:** Assigns a unique resource ID (`android:id="@+id/textViewHelloWorld"`) to easily manipulate or reference the view in the Java/Kotlin code.

### 2. Activity Lifecycle Demonstration
The application tracks and reports every state change in the Activity Lifecycle. Whenever the Activity state changes (e.g., minimizing the app, rotating the screen, or closing it), the app notifies the developer and user using three different feedback mechanisms:
* **Log Messages:** Prints detailed logs to the Android Studio **Logcat** to trace the exact sequence of method calls.
* **Toast Messages:** Displays brief, auto-expiring pop-up notifications on the screen.
* **Snackbar Messages:** Shows a lightweight, interactive message bar at the bottom of the screen.

## 🔄 Lifecycle Methods Tracked

The following overridden methods print to Logcat and trigger UI notifications to demonstrate the lifecycle:
* `onCreate()` - Activity is first created and the UI is initialized.
* `onStart()` - Activity becomes visible to the user.
* `onResume()` - Activity starts interacting with the user (foreground).
* `onPause()` - Activity loses focus but may still be partially visible.
* `onStop()` - Activity is no longer visible.
* `onDestroy()` - Activity is destroyed and removed from memory.
* `onRestart()` - Activity is restarting after being stopped.

## 📚 Concepts Covered & Studied

* **User Interface (UI) Components:**
  * **TextView:** Creating and customizing text displays.
  * **View Properties:** Understanding size (`sp` vs `dp`), text styles, and color applications.
  * **ConstraintLayout:** Using layout constraints (top-to-top, bottom-to-bottom, etc.) to center elements responsively on different screen sizes.
  * **In-built Resources:** Utilizing Android's native system colors (e.g., `@android:color/holo_blue_bright`) instead of hardcoding custom hex values.
* **System Feedback & Debugging:**
  * **Logcat (`android.util.Log`):** Using `Log.d()`, `Log.i()`, etc., for debugging state changes without interrupting the user interface.
  * **Toast (`android.widget.Toast`):** Providing temporary visual feedback.
  * **Snackbar (`com.google.android.material.snackbar.Snackbar`):** Utilizing Material Design components for user feedback.
* **Core Android Architecture:**
  * Deep understanding of the **Activity Life Cycle** and how the Android OS manages app memory, foreground, and background states.
