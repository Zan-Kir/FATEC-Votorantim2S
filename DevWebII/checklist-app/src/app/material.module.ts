import { NgModule } from "@angular/core";
import { MatButtonModule, MatIconButton } from "@angular/material/button";
import { MatIconModule } from "@angular/material/icon";
import { MatListModule } from "@angular/material/list";
import { MatSidenavModule } from "@angular/material/sidenav";
import { MatToolbarModule } from "@angular/material/toolbar";
import { FormsModule } from '@angular/forms';
import {MatDividerModule} from '@angular/material/divider';

@NgModule({
    imports:[MatSidenavModule, MatListModule, 
        MatIconModule, MatToolbarModule, MatButtonModule,
        FormsModule, MatIconButton, MatDividerModule],
    exports:[MatSidenavModule, MatListModule, 
        MatIconModule, MatToolbarModule, MatButtonModule,
        FormsModule, MatIconButton, MatDividerModule]
})

export class MaterialModule {
    
}