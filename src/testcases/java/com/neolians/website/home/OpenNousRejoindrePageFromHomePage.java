package com.neolians.website.home;

import com.neolians.common.utils.report.Report;
import com.neolians.website.functions.general.Errors;
import com.neolians.website.functions.general.Footer;
import com.neolians.website.functions.general.Menu;
import com.neolians.website.functions.pages.Home;
import com.neolians.website.functions.pages.NosPartenaires;
import com.neolians.website.functions.pages.NousRejoindre;
import com.neolians.website.utils.report.NeoliansTestcase;
import io.github.artsok.RepeatedIfExceptionsTest;

public class OpenNousRejoindrePageFromHomePage extends NeoliansTestcase {

    @RepeatedIfExceptionsTest(repeats = 1, suspend = 5000L, name = "checkNousRejoindrePage")
    void checkNousRejoindrePage() {


        Report.newStep(1, "Open Home Page");
        Home.openPage();

        Report.newStep(2, "Open NousRejoindre Page");
        Home.openPageNousRejoindre();

        Report.newStep(3, "Verify Menu");
        Menu.verifieMenu();

        Report.newStep(4, "Check Nous Rejoindre Page");
        NousRejoindre.verifiePageNosRejoindre();

        Report.newStep(5, "Verify Footer");
        Footer.verifieFooter();

        Report.newStep(6, "Check No error");
        Errors.checkNoErrors();



    }
}
