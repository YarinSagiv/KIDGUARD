from PIL import Image
import pytesseract

image = 'C:/Users/User/Desktop/pythonProject/data/image 1.png'
text = pytesseract.image_to_string(Image.open(image), lang="eng")
print(text)
