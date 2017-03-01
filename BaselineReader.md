#BaselineReader

This just uses the Google mobile vision text reading library in its out-of-the-box format. This is just so that I can have a baseline with which to see what the efficiency of it is, and to compare future improvements to it.

To make life easier for myself, I'm going to simply read in images I've already taken using my phone, so that I can make sure that any improvements are due to changes in code, rather that me happening to take a better photo. I'll  use a range of different labels of varying simplicity for reading.

<img src="images/BaselineReader/BunnSauvignon_text.png" width="250"> <img src="images/BaselineReader/Darling1_text.png" width="250"> <img src="images/BaselineReader/Darling2_text.png" width="250">

<img src="images/BaselineReader/Huff_text.png" width="250"> <img src="images/BaselineReader/NZero_text.png" width="250"> <img src="images/BaselineReader/SandyFarm_text.png" width="250">

<img src="images/BaselineReader/TempleBruerMalbeck_text.png" width="250"> <img src="images/BaselineReader/TempleBruerPinot_text.png" width="250"> <img src="images/BaselineReader/TempleBruerShiraz_text.png" width="250">

<img src="images/BaselineReader/Giesen.png" width="250"> <img src="images/BaselineReader/JJ.png" width="250"> <img src="images/BaselineReader/JE.png" width="250">

<img src="images/BaselineReader/LeSabbie.png" width="250"> <img src="images/BaselineReader/NaturalSauvignon.png" width="250"> <img src="images/BaselineReader/NaturalShiraz.png" width="250">

<img src="images/BaselineReader/OlsenWinesPinot.png" width="250"> <img src="images/BaselineReader/OlsenWinesMerlot.png" width="250"> <img src="images/BaselineReader/PigInTheHouse1.png" width="250">

Okay, so some inital thoughts on the images above:

- It does a decent job on the simple black writing on a white background
 - This is in line with it's ability to read text from, say, a book
- It does a decent job or reading white writing on a blackbackground 
- It doesn't do well with gold on black writing
- It doesn't do well on 'fancy' (i.e. cursive) writing
 - It completely fails on properly stylised writing (e.g. the Sandy Farm main header)
- It fails completely to read curved writing (e.g. the top Temple Bruer header)
- It doesn't do well when there is a slight gradient in the background (e.g. a shadow gradient)
