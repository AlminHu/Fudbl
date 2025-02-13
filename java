document.addEventListener("DOMContentLoaded", function() {
    const igraci = {
        "Luka Modrić": {
            slika: "https://upload.wikimedia.org/wikipedia/commons/2/2d/Luka_Modric_2018.jpg",
            biografija: "Luka Modrić je hrvatski fudbaler, igra za Real Madrid. Rođen 1985. godine u Zadru."
        },
        "Dušan Tadić": {
            slika: "https://upload.wikimedia.org/wikipedia/commons/8/87/Dusan_Tadic_2021.jpg",
            biografija: "Dušan Tadić je srpski fudbaler, igra za Fenerbahče. Rođen 1988. godine u Bačkoj Topoli."
        },
        "Edin Džeko": {
            slika: "https://upload.wikimedia.org/wikipedia/commons/3/30/Edin_Dzeko_2021.jpg",
            biografija: "Edin Džeko je bosanskohercegovački fudbaler, igra za Fenerbahče. Rođen 1986. godine u Sarajevu."
        }
    };

    window.prikaziDetalje = function(ime) {
        const igrac = igraci[ime];
        if (igrac) {
            document.getElementById("igrac-slika").src = igrac.slika;
            document.getElementById("detalji").textContent = igrac.biografija;
            document.getElementById("detalji-igraca").style.display = "block";
        }
    };

    window.zatvoriDetalje = function() {
        document.getElementById("detalji-igraca").style.display = "none";
    };
});
