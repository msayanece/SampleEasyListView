# SampleEasyListView
This is a sample project showing how to use [EasyListView - A Better RecyclerView](https://github.com/msayanece/EasyListView)

Get rid of the old Recycler View with adapter and have fun showing list of views easily with EasyListView just like Flutter.
Use the very easy builder pattern for setting up your list with only 8 to 10 lines of code.

<img src="https://github.com/msayanece/EasyListView/blob/master/list.gif" width="300" height="520"> 


## Getting Started


## Prerequisites

1. Android Studio (Gradle build system)*
2. A project where you want to add a list of views like RecyclerView


## Quick Setup

### 1. Include library

**In App Gradle File**

``` gradle
dependencies {
    ...
    implementation 'com.github.msayanece:EasyListView:0.0.4'
}
```
**In Project Gradle File**
``` project gradle
allprojects {
    repositories {
       ...
        maven { url 'https://jitpack.io' }
    }
}
```


### 2. Basic Usage

 * In your Activity or Fragment : Where you have added the RecyclerView in your layout and get the RecyclerView object of your layout in your Java or Kotlin file and pass it to the SDK.
 
 * Create a ListTile object to map the getter methods of the model

``` java
        ListTile<ItemsPOJO> listTile = new ListTile<ItemsPOJO>(ItemsPOJO.class)
                    .addTitle("getName")        //Argument-> method name of the Model to be mapped
                    .addDescription("getDesc")  //Argument-> method name of the Model to be mapped
                    .addIcon(EasyListView.IconPosition.LEADING, "getImage");
                                                ////Argument->LEADING or TRAILING and method name of the Model to be mapped
```

 * Build the EasyListView with your ListTile object.

``` java
        new EasyListView.Builder<ItemsPOJO>(this)
                    .addRecyclerView(recyclerView)            // Pass your RecyclerView
                    .addListItems(listItems)                  // The List of items to display
                    .addItemModel(ItemsPOJO.class)            // The Item Model.class
                    .addRow(listTile)                         // Add the ListTile object you have just created
                    .setCount(5)                              // Optional set item count
                    .setOnItemClickListener(this)             // Optional set on click listener
                    .setOnBindViewHolderCalledListener(this)  // Optional set on bind view holder to write your own logic
                    .Build();
```


### 3. Custom Usage

 * In your Activity or Fragment : Where you have added the RecyclerView in your layout and get the RecyclerView object of your layout in your Java or Kotlin file and pass it to the SDK.
 
 
 * Create your custom layout for the row template.
 

* Create the model class and annotate with `@ID(viewResID)` to the corresponding `getter` method for setting model data automatically without any logic, when the list loads.

**You can _skip this step_, if you are going to write your _own logic_ inside the _onBindViewHolderListener_ using the _setOnBindViewHolderCalledListener() method._**

 
 * Build the EasyListView with your own custom objects.

``` java
        new EasyListView.Builder<CustomItemsPOJO>(this)
                .addRecyclerView(recyclerView)                      //Mandatory, the RecyclerView object
                .addListItems(listItems)                            //Mandatory, the list of Items (Models)
                .addItemModel(CustomItemsPOJO.class)                //Mandatory, the Model .class
                .setCount(5)                                        //Optional, set count of items in the list             
                .addLayoutManager(new LinearLayoutManager(this))    //Optional, The SDK will use this layout manager only for the custom setup
                .addRow(R.layout.child_layout)                      // The custom layout of Recycler child 
                .setOnItemClickListener(this)                       //Optional
                .setOnBindViewHolderCalledListener(this)            //Optional, if you want to execute your own logic
                .Build();
```

 * If you want you may write your own logic inside the callback methods of the OnBindViewHolderCalledListener.


## For more detailed documentation please see [EasyListView - A Better RecyclerView](https://github.com/msayanece/EasyListView)

### Installing

1. Fork this repository to your github profile (On the Top-Right corner).
2. Copy the URL of your repository on your profile from your browser.
3. Open Android Studio.
4. click on File --> New --> Project from Version Control --> Git.
5. Paste the URL on GIT Repository URL Box.
6. Select your Parent Directory (Where the project should be installed in your local Computer).
7. Change the Directory name if you want.
8. Click on Clone. ( After cloning if any pop-up appears, Click on Remove Selected)

And You are done.


### Running the tests

After gradle build finished, you can run it on your Emulator or real device by clicking on the green triangular buuton on the top.


### Built With

Gradle



## Authors

Sayan Mukherjee - Android Developer
See also the list of contributors who participated in this project.


## License

This project is free and open source to use in any project if you want.


## Acknowledgments

This Project is based on The EasyListView a better RecyclerView of Android. Other concepts of Java like circleimageview, SuperNova-Emoji, recyclerview and Google's Glide library has been used in this project.