# Image File Type Detector (RAW, BMP, JPEG, TIFF, PNG, GIF)

## Overview

This Java-based application is designed to detect the type of an image file by reading its header data. It supports a variety of image formats, including **RAW (CR2)**, **BMP**, **JPEG**, **TIFF**, **PNG**, and **GIF**. The program examines the first few bytes of the file to determine the format and then prints the file type.

## Features

- Detects **RAW (CR2)**, **BMP**, **JPEG**, **TIFF**, **PNG**, and **GIF** image formats.
- Reads the file’s header and identifies the format based on the unique magic bytes for each format.
- Displays the **absolute file path** for user reference.
- Prints the detected image type to the console.

## Requirements

- **Java 8** or higher
- Supported image files: **RAW (CR2)**, **BMP**, **JPEG**, **TIFF**, **PNG**, **GIF**.

## How to Use

1. **Download** or **clone** the repository.
2. Ensure that your **image file** is placed in the **same folder** as the source code file.
3. **Run the program**.
4. When prompted, **enter the image file name** (including its extension).
5. The program will display the **file path** and then identify the file type based on its header.

## Example Output

For a **RAW (CR2)** image:

```
please enter the file name with extension and make sure that file is in the same folder as the project
File Name: sample.CR2
File path: C:\Projects\ImageFileDetector\sample.CR2
The Type of this Image is RAW
```

For a **JPEG** image:

```
please enter the file name with extension and make sure that file is in the same folder as the project
File Name: sample.jpeg
File path: C:\Projects\ImageFileDetector\sample.jpeg
The Type of this Image is JPEG
```

For an unsupported format:

```
please enter the file name with extension and make sure that file is in the same folder as the project
File Name: sample.xyz
File path: C:\Projects\ImageFileDetector\sample.xyz
The program doesn't support this type of image
```

## Known Issues

- The program currently only supports **RAW (CR2)**, **BMP**, **JPEG**, **TIFF**, **PNG**, and **GIF** image formats. Other image formats will not be detected correctly.
- It assumes the image file follows the standard header structure for each format.

## Future Improvements

- Extend support for additional image formats.
- Add functionality to display more detailed image metadata (e.g., resolution, color depth).
- Implement better error handling for unsupported or corrupted files.

## Author
Marina Abdallah– https://github.com/Marina-Abdallah
