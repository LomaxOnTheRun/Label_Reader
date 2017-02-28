# Label_Reader

This is going to be a look into the feasability and effectiveness of creating an application in Android studio for reading labels on bottles of wine.

###Goals

The goal of this project will be to pick out and read, with a high level of accuracy, the following portions of the label:

- The name of the wine
- The manufacterer's name
- The type of wine

###Immediate concerns

I've had some previous experience trying to do this using the Mobile Vision library offered by Google for Android development, and the results have been somewhat disheartening. I've unfortunately not been able to trial the tess-two library as I've had problems importing it into my projects. The problems I've found so far have been:

- It only partially reads words, even if the word doesn't particularly change in quality part way through
- It doesn't find chunks of the text
- It completely ignores even moderately fancy text
- It can't read writing that is curved (a problem for labels on curved objects such as bottles)

###Immediate thoughts

I've had some initial thoughs on things to try:

- Look into whether Google's text reader is tweakable (using existing methods)
- Look at techniques for making the background less complicated to read from
- Look at 'flattening out' the labels using image manipulation libraries
- Look into other OCR libraries, although I'd like not have to resort to this as Google's stuff is particularly easy to plug in to Android applications)
- Create my own machine learning techniques and software for this (again, this is a potential rabbithole)

###Code

The code used for this project will be stored in the LabelReader folder, and will havea separate activity class for each iteration of improvements / trials. The first will be the BaselineReader class, which will look at how effective Google's text reader is out of the box.

I'll keep separate .md files for each activity, as each one should implement / improve some functionality, and these .md files will keep track of what I'm doing and why.
