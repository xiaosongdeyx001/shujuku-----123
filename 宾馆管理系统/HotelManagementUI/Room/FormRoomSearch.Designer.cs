namespace HotelManagementUI.Room
{
    partial class FormRoomSearch
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormRoomSearch));
            this.button3_close = new System.Windows.Forms.Button();
            this.button2_clr = new System.Windows.Forms.Button();
            this.button1_search = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.textBox_price2 = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.checkBox_auto = new System.Windows.Forms.CheckBox();
            this.label4 = new System.Windows.Forms.Label();
            this.textBox_state = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.comboBox1_kind = new System.Windows.Forms.ComboBox();
            this.textBox2_price = new System.Windows.Forms.TextBox();
            this.textBox1_name = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // button3_close
            // 
            this.button3_close.Location = new System.Drawing.Point(242, 270);
            this.button3_close.Name = "button3_close";
            this.button3_close.Size = new System.Drawing.Size(75, 23);
            this.button3_close.TabIndex = 14;
            this.button3_close.Text = "退出(&Q)";
            this.button3_close.UseVisualStyleBackColor = true;
            this.button3_close.Click += new System.EventHandler(this.button3_close_Click);
            // 
            // button2_clr
            // 
            this.button2_clr.Location = new System.Drawing.Point(130, 270);
            this.button2_clr.Name = "button2_clr";
            this.button2_clr.Size = new System.Drawing.Size(75, 23);
            this.button2_clr.TabIndex = 13;
            this.button2_clr.Text = "清除(&C)";
            this.button2_clr.UseVisualStyleBackColor = true;
            this.button2_clr.Click += new System.EventHandler(this.button2_clr_Click);
            // 
            // button1_search
            // 
            this.button1_search.Location = new System.Drawing.Point(30, 270);
            this.button1_search.Name = "button1_search";
            this.button1_search.Size = new System.Drawing.Size(75, 23);
            this.button1_search.TabIndex = 12;
            this.button1_search.Text = "查找(&S)";
            this.button1_search.UseVisualStyleBackColor = true;
            this.button1_search.Click += new System.EventHandler(this.button1_search_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.textBox_price2);
            this.groupBox1.Controls.Add(this.label6);
            this.groupBox1.Controls.Add(this.checkBox_auto);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.textBox_state);
            this.groupBox1.Controls.Add(this.label5);
            this.groupBox1.Controls.Add(this.comboBox1_kind);
            this.groupBox1.Controls.Add(this.textBox2_price);
            this.groupBox1.Controls.Add(this.textBox1_name);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Location = new System.Drawing.Point(12, 21);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(325, 231);
            this.groupBox1.TabIndex = 11;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "客房信息查找条件";
            // 
            // textBox_price2
            // 
            this.textBox_price2.Location = new System.Drawing.Point(131, 59);
            this.textBox_price2.Name = "textBox_price2";
            this.textBox_price2.Size = new System.Drawing.Size(41, 21);
            this.textBox_price2.TabIndex = 18;
            this.textBox_price2.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox_price2_KeyPress);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(28, 92);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(65, 12);
            this.label6.TabIndex = 17;
            this.label6.Text = "价格下限：";
            // 
            // checkBox_auto
            // 
            this.checkBox_auto.AutoSize = true;
            this.checkBox_auto.Location = new System.Drawing.Point(18, 198);
            this.checkBox_auto.Name = "checkBox_auto";
            this.checkBox_auto.Size = new System.Drawing.Size(72, 16);
            this.checkBox_auto.TabIndex = 16;
            this.checkBox_auto.Text = "智能匹配";
            this.checkBox_auto.UseVisualStyleBackColor = true;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(110, 202);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(209, 12);
            this.label4.TabIndex = 15;
            this.label4.Text = "选择需要查找的信息，不需要的留空。";
            // 
            // textBox_state
            // 
            this.textBox_state.Location = new System.Drawing.Point(131, 161);
            this.textBox_state.Name = "textBox_state";
            this.textBox_state.Size = new System.Drawing.Size(100, 21);
            this.textBox_state.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(28, 161);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(41, 12);
            this.label5.TabIndex = 8;
            this.label5.Text = "状态：";
            // 
            // comboBox1_kind
            // 
            this.comboBox1_kind.FormattingEnabled = true;
            this.comboBox1_kind.Items.AddRange(new object[] {
            "单人间",
            "双人间",
            "大床间",
            "标准间",
            "标准间单人住",
            "三人间",
            "四人间",
            "套间",
            "公寓",
            "别墅"});
            this.comboBox1_kind.Location = new System.Drawing.Point(131, 123);
            this.comboBox1_kind.Name = "comboBox1_kind";
            this.comboBox1_kind.Size = new System.Drawing.Size(100, 20);
            this.comboBox1_kind.TabIndex = 6;
            // 
            // textBox2_price
            // 
            this.textBox2_price.Location = new System.Drawing.Point(131, 91);
            this.textBox2_price.Name = "textBox2_price";
            this.textBox2_price.Size = new System.Drawing.Size(41, 21);
            this.textBox2_price.TabIndex = 5;
            this.textBox2_price.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.textBox2_price_KeyPress);
            // 
            // textBox1_name
            // 
            this.textBox1_name.Location = new System.Drawing.Point(131, 32);
            this.textBox1_name.Name = "textBox1_name";
            this.textBox1_name.Size = new System.Drawing.Size(100, 21);
            this.textBox1_name.TabIndex = 4;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(28, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "客房名称：";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(28, 64);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(65, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "价格上限：";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(28, 123);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "类型：";
            // 
            // FormRoomSearch
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.AliceBlue;
            this.ClientSize = new System.Drawing.Size(350, 307);
            this.Controls.Add(this.button3_close);
            this.Controls.Add(this.button2_clr);
            this.Controls.Add(this.button1_search);
            this.Controls.Add(this.groupBox1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "FormRoomSearch";
            this.Text = "住房查询";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button button3_close;
        private System.Windows.Forms.Button button2_clr;
        private System.Windows.Forms.Button button1_search;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox textBox_state;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.ComboBox comboBox1_kind;
        private System.Windows.Forms.TextBox textBox2_price;
        private System.Windows.Forms.TextBox textBox1_name;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.CheckBox checkBox_auto;
        private System.Windows.Forms.TextBox textBox_price2;
        private System.Windows.Forms.Label label6;
    }
}