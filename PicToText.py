from PIL import Image
import pytesseract
from CombineSevices import activateAI

image = 'C:/Users/User/Desktop/pythonProject/data/image 1.png'
text = pytesseract.image_to_string(Image.open(image), lang="eng")

# write to file
f = open("textFromPic.json", "w")
f.write(text)
f.close()

activateAI()

