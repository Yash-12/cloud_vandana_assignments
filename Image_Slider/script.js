document.addEventListener("DOMContentLoaded", function() {
    const images = [
        "https://via.placeholder.com/600x400?text=Image+1",
        "https://via.placeholder.com/600x400?text=Image+2",
        "https://via.placeholder.com/600x400?text=Image+3",
        "https://via.placeholder.com/600x400?text=Image+4"
    ];

    let currentIndex = 0;

    const sliderImage = document.getElementById("sliderImage");
    const prevButton = document.getElementById("prevButton");
    const nextButton = document.getElementById("nextButton");
    function updateImage() {
        sliderImage.src = images[currentIndex];
    }
    prevButton.addEventListener("click", function() {
        currentIndex = (currentIndex === 0) ? images.length - 1 : currentIndex - 1;
        updateImage();
    });
    nextButton.addEventListener("click", function() {
        currentIndex = (currentIndex === images.length - 1) ? 0 : currentIndex + 1;
        updateImage();
    });
    updateImage();
});