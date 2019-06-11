namespace HotelManagementUI.Room
{
    partial class FormRoomAdd
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(FormRoomAdd));
            this.label1 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.textBox3_remark = new System.Windows.Forms.TextBox();
            this.comboBox1_kind = new System.Windows.Forms.ComboBox();
            this.textBox2_price = new System.Windows.Forms.TextBox();
            this.textBox1_name = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.button1_add = new System.Windows.Forms.Button();
            this.button2_clr = new System.Windows.Forms.Button();
            this.button3_close = new System.Windows.Forms.Button();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.SuspendLayout();
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
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(28, 131);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 2;
            this.label3.Text = "类型：";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(28, 173);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(41, 12);
            this.label4.TabIndex = 3;
            this.label4.Text = "备注：";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.textBox3_remark);
            this.groupBox1.Controls.Add(this.comboBox1_kind);
            this.groupBox1.Controls.Add(this.textBox2_price);
            this.groupBox1.Controls.Add(this.textBox1_name);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Location = new System.Drawing.Point(36, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(379, 273);
            this.groupBox1.TabIndex = 4;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "客房信息";
            // 
            // textBox3_remark
            // 
            this.textBox3_remark.Location = new System.Drawing.Point(131, 173);
            this.textBox3_remark.Multiline = true;
            this.textBox3_remark.Name = "textBox3_remark";
            this.textBox3_remark.Size = new System.Drawing.Size(205, 86);
            this.textBox3_remark.TabIndex = 7;
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
            this.comboBox1_kind.Location = new System.Drawing.Point(131, 131);
            this.comboBox1_kind.Name = "comboBox1_kind";
            this.comboBox1_kind.Size = new System.Drawing.Size(121, 20);
            this.comboBox1_kind.TabIndex = 6;
            // 
            // textBox2_price
            // 
            this.textBox2_price.Location = new System.Drawing.Point(131, 78);
            this.textBox2_price.Name = "textBox2_price";
            this.textBox2_price.Size = new System.Drawing.Size(100, 21);
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
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(28, 81);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "价格：";
            // 
            // button1_add
            // 
            this.button1_add.Location = new System.Drawing.Point(54, 17);
            this.button1_add.Name = "button1_add";
            this.button1_add.Size = new System.Drawing.Size(75, 23);
            this.button1_add.TabIndex = 5;
            this.button1_add.Text = "增加(&A)";
            this.button1_add.UseVisualStyleBackColor = true;
            this.button1_add.Click += new System.EventHandler(this.button1_add_Click);
            // 
            // button2_clr
            // 
            this.button2_clr.Location = new System.Drawing.Point(183, 17);
            this.button2_clr.Name = "button2_clr";
            this.button2_clr.Size = new System.Drawing.Size(75, 23);
            this.button2_clr.TabIndex = 6;
            this.button2_clr.Text = "清除(&C)";
            this.button2_clr.UseVisualStyleBackColor = true;
            this.button2_clr.Click += new System.EventHandler(this.button2_clr_Click);
            // 
            // button3_close
            // 
            this.button3_close.Location = new System.Drawing.Point(324, 17);
            this.button3_close.Name = "button3_close";
            this.button3_close.Size = new System.Drawing.Size(75, 23);
            this.button3_close.TabIndex = 7;
            this.button3_close.Text = "退出(&Q)";
            this.button3_close.UseVisualStyleBackColor = true;
            this.button3_close.Click += new System.EventHandler(this.button3_close_Click);
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            this.splitContainer1.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.groupBox1);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.button1_add);
            this.splitContainer1.Panel2.Controls.Add(this.button3_close);
            this.splitContainer1.Panel2.Controls.Add(this.button2_clr);
            this.splitContainer1.Size = new System.Drawing.Size(459, 375);
            this.splitContainer1.SplitterDistance = 312;
            this.splitContainer1.TabIndex = 8;
            // 
            // FormRoomAdd
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.AliceBlue;
            this.ClientSize = new System.Drawing.Size(459, 375);
            this.Controls.Add(this.splitContainer1);
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "FormRoomAdd";
            this.Text = "客房录入";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox textBox3_remark;
        private System.Windows.Forms.ComboBox comboBox1_kind;
        private System.Windows.Forms.TextBox textBox2_price;
        private System.Windows.Forms.TextBox textBox1_name;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button button1_add;
        private System.Windows.Forms.Button button2_clr;
        private System.Windows.Forms.Button button3_close;
        private System.Windows.Forms.SplitContainer splitContainer1;
    }
}