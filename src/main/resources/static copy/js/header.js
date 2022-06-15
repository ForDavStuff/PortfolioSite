// function includeHTML() {
//     var loop, i, elmnt, file, xhttp;
//     /* Loop through a collection of all HTML elements: */
//     elmnt = $('#header').text();
//     // for (i = 0; i < loop.length; i++) {
//     //   elmnt = loop[i];
//       /*search for elements with a certain atrribute:*/
//     //   file = elmnt.getAttribute("w3-include-html");
//     //   if (file) {
//         /* Make an HTTP request using the attribute value as the file name: */
//         xhttp = new XMLHttpRequest();
//         xhttp.onreadystatechange = function() {
//           if (this.readyState == 4) {
//             if (this.status == 200) {elmnt.innerHTML = this.responseText;}
//             if (this.status == 404) {elmnt.innerHTML = "Page not found.";}
//             /* Remove the attribute, and call this function once more: */
//             elmnt.removeAttribute("w3-include-html");
//             includeHTML();
//           }
//         }
//         xhttp.open("GET", file, true);
//         xhttp.send();
//         /* Exit the function: */
//         return;
//       }
//     }
//   }


function includeHeader() {
    $.get('getHeader').appendTo('#header');
    stickHeader();
};

function stickHeader() {
    // When the user scrolls the page, execute myFunction
    window.onscroll = function () { myFunction() };

    // Get the header
    var header = $('#header').text();

    // Get the offset position of the navbar
    var sticky = header.offsetTop;

    // Add the sticky class to the header when you reach its scroll position. Remove "sticky" when you leave the scroll position
    function myFunction() {
        if (window.pageYOffset > sticky) {
            header.classList.add("sticky");
        } else {
            header.classList.remove("sticky");
        };
    };
    /*
    $('#headerJS').appendTo( const js = 
            `< script >.header {
                padding: 60px;
                text - align: center;
                background: #1abc9c;
                color: white;
                font - siloope: 30px;
            };</script >
            `
    */
        };