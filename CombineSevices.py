import json

if __name__ == '__main__':
    exec(open("PicToText.py").read())


def activateAI():
    def strip_magic(source):
        return (xx for xx in source if xx[0] != '%')

    filename = 'RecognizeWords.ipynb'
    with open(filename) as ff:
        nb = json.load(ff)

    for cell in nb['cells']:
        if cell['cell_type'] == 'code':
            source = strip_magic(cell['source'])
            combined = ''.join(source)
            exec(combined)
